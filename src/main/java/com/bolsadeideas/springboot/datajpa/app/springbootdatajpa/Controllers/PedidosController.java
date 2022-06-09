package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import java.util.Map;

import javax.validation.Valid;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service.IClienteService;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service.IPedidosService;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IPedidosDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Pedidos;

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
public class PedidosController {
    // hola
    // @Autowired
    // @Qualifier("ClienteDaoJPA")
    // private IClienteDao clienteDao;

    // nueva formca con el service
    @Autowired // preguntar para que sirve
    private IPedidosService pedidosService;

    @GetMapping("/listarPedidos")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de pedidos");
        model.addAttribute("pedidos", pedidosService.findAll());

        return "listarPedidos";
    }

    @GetMapping("/formPedidos") // recibe la informacion u cambio
    public String crear(Map<String, Object> model) // Map <String,Object> model se usa para mandar la informacion al
                                                   // thymeleaf es un tipo model.addAttribute
    {

        // instanciando la clase cliente o entidad cliente
        Pedidos pedidos = new Pedidos();

        // model put para mostrar cliente
        model.put("pedidos", pedidos);

        model.put("titulo", "formulario pedidos");

        return "formPedidos";

    }

    @RequestMapping(value = "/formPedidos", method = RequestMethod.POST) // guarda la informacion en el mismo /form
    // ..post...toma los datos y depues los guarda
    public String guardar(@Valid Pedidos pedidos, BindingResult result, Model model) {

        if (result.hasErrors()) {

            model.addAttribute("titulo", "Formulario de pedidos Error");
            return "formPedidos";

        }
        pedidosService.save(pedidos);
        return "redirect:listarPedidos";

    }

    @GetMapping("/formPedidos/{id}") // al usar el pathVatiable se debe poner el dato extra en la url
    public String editar(@PathVariable Long id, Map<String, Object> model) {

        Pedidos pedidos = null;

        if (id > 0) {

            pedidos = pedidosService.findone(id);
        } else {

            return "redirect:/listarPedidos"; // redirigir a listar
        }

        // model put para mostrar cliente
        model.put("pedidos", pedidos);

        model.put("titulo", "Editar Pedido");

        return "formPedidos";
    }

    @GetMapping("/eliminarP/{id}")
    public String eliminar(@PathVariable Long id) { // @PathVariable se usa para mandar informacion por URL

        if (id > 0) {

            pedidosService.delete(id);

        }

        return "redirect:/listarPedidos";
    }

}
