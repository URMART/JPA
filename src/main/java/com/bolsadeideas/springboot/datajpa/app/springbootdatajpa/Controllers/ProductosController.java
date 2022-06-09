package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import java.util.Map;

import javax.validation.Valid;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Productos;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service.IClienteService;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.service.IProductosService;

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
public class ProductosController {
    // hola
    // @Autowired
    // @Qualifier("ClienteDaoJPA")
    // private IClienteDao clienteDao;

    // nueva formca con el service
    @Autowired // preguntar para que sirve
    private IProductosService productosService;

    @GetMapping("/listarr")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de productos");
        model.addAttribute("productos", productosService.findAllr());

        return "listarr";
    }

    @GetMapping("/formr") // recibe la informacion u cambio
    public String crear(Map<String, Object> model) // Map <String,Object> model se usa para mandar la informacion al
                                                   // thymeleaf es un tipo model.addAttribute
    {

        // instanciando la clase cliente o entidad cliente
        Productos productos = new Productos();

        // model put para mostrar cliente
        model.put("productos", productos);

        model.put("titulo", "formulario productos");

        return "formr";

    }

    // PostMapping("/form")
    @RequestMapping(value = "/formr", method = RequestMethod.POST) // guarda la informacion en el mismo /form
                                                                   // ..post...toma los datos y depues los guarda
    public String guardar(@Valid Productos productos, BindingResult result, Model model) {

        if (result.hasErrors()) {

            model.addAttribute("titulo", "Formulario de productos Error");
            return "formr";

        }
        productosService.saver(productos);
        return "redirect:listarr";

    }

    @GetMapping("/formr/{id}") // al usar el pathVatiable se debe poner el dato extra en la url
    public String editar(@PathVariable Long id, Map<String, Object> model) {

        Productos productos = null;

        if (id > 0) {

            productos = productosService.findoner(id);
        } else {

            return "redirect:/listarr"; // redirigir a listar
        }

        // model put para mostrar cliente
        model.put("productos", productos);

        model.put("titulo", "Editar productos");

        return "formr";
    }

    @GetMapping("/eliminarr/{id}")
    public String eliminar(@PathVariable Long id) { // @PathVariable se usa para mandar informacion por URL

        if (id > 0) {

            productosService.deleter(id);

        }

        return "redirect:/listarr";
    }

}
