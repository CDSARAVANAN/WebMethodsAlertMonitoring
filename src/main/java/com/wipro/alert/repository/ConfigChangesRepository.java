package com.wipro.alert.repository;
import org.springframework.data.repository.CrudRepository;
import com.wipro.alert.model.ConfigChanges;
public interface ConfigChangesRepository extends CrudRepository<ConfigChanges, Integer>
{
}
