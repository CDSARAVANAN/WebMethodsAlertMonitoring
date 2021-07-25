package com.wipro.alert.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.alert.model.ConfigChanges;
import com.wipro.alert.service.ConfigChangesService;
//creating RestController
@RestController
public class AlertController 
{

@Autowired
ConfigChangesService configChangesService;
//creating a get mapping that retrieves all the config detail from the database 
@GetMapping("/configchanges")
private List<ConfigChanges> getAllConfigChanges() 
{
return configChangesService.getAllConfigChanges();
}
//creating a get mapping that retrieves the detail of a specific config
@GetMapping("/config/{id}")
private ConfigChanges getConfigById(@PathVariable("id") int id) 
{
return configChangesService.getConfigChangesById(id);
}
//creating a delete mapping that deletes a specific config
@DeleteMapping("/deleteconfig/{id}")
private void deleteConfig(@PathVariable("id") int id) 
{
	configChangesService.delete(id);
}
//creating post mapping that post the config detail in the database
@PostMapping("/config")
private int saveConfigChanges(@RequestBody ConfigChanges config) 
{
	configChangesService.saveOrUpdate(config);
return config.getId();
}
}
