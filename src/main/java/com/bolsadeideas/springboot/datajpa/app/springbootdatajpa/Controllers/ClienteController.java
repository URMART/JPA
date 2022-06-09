package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import java.util.Map;

import javax.validation.Valid;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {
    // hola
    // @Autowired
    // @Qualifier("ClienteDaoJPA")
    // private IClienteDao clienteDao;

    // nueva formca con el service
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clienteService.findAll());

        return "listar";
    }

    @GetMapping("/form") // recibe la informacion u cambio
    public String crear(Map<String, Object> model) // Map <String,Object> model se usa para mandar la informacion al
                                                   // thymeleaf es un tipo model.addAttribute
    {

        // instanciando la clase cliente o entidad cliente
        Cliente cliente = new Cliente();

        // model put para mostrar cliente
        model.put("cliente", cliente);

        model.put("titulo", "formulario cliente");

        return "form";

    }

    // PostMapping("/form")
    @RequestMapping(value = "/form", method = RequestMethod.POST) // guarda la informacion en el mismo /form
                                                                  // ..post...toma los datos y depues los guarda
    public String guardar(@Valid Cliente cliente, BindingResult result, Model model) {

        if (result.hasErrors()) {

            model.addAttribute("titulo", "Formulario de Cliente Error");
            return "form";

        }
        clienteService.save(cliente);
        return "redirect:listar";

    }

    @GetMapping("/form/{id}") // al usar el pathVatiable se debe poner el dato extra en la url
    public String editar(@PathVariable Long id, Map<String, Object> model) {

        Cliente cliente = null;

        if (id > 0) {

            cliente = clienteService.findone(id);
        } else {

            return "redirect:/listar"; // redirigir a listar
        }

        // model put para mostrar cliente
        model.put("cliente", cliente);

        model.put("titulo", "Editar cliente");

        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) { // @PathVariable se usa para mandar informacion por URL

        if (id > 0) {

            clienteService.delete(id);

        }

        return "redirect:/listar";
    }

}
