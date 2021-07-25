package com.wipro.alert.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.alert.model.ConfigChanges;
import com.wipro.alert.repository.ConfigChangesRepository;
//defining the business logic
@Service
public class ConfigChangesService 
{
@Autowired
ConfigChangesRepository configChangesRepository;
//getting all config changes records
public List<ConfigChanges> getAllConfigChanges() 
{
List<ConfigChanges> configchanges = new ArrayList<ConfigChanges>();
configChangesRepository.findAll().forEach(student -> configchanges.add(student));
return configchanges;
}
//getting all config changes records
public ConfigChanges getConfigChangesById(int id) 
{
return configChangesRepository.findById(id).get();
}
public void saveOrUpdate(ConfigChanges student) 
{
	configChangesRepository.save(student);
}
//deleting a specific record
public void delete(int id) 
{
	configChangesRepository.deleteById(id);
}
}