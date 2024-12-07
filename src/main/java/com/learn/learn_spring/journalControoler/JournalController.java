package com.learn.learn_spring.journalControoler;

import com.learn.learn_spring.Entery.JournalEntery;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/add")
public class JournalController {
   private Map<Long , JournalEntery> entery = new HashMap<>();

   //get method
    @GetMapping
    public List<JournalEntery> getAll(){
        return new ArrayList<>(entery.values());
    }
//    post wethod
    @PostMapping
    public boolean create(@RequestBody JournalEntery data){
       entery.put(data.getId() , data);
        return true;
    }
    //get one id method
    @GetMapping("/id/{id}")
    public JournalEntery getById(@PathVariable Long id){
        return entery.get(id);
    }

    // update & put method
    @PutMapping("/id/{id}")
    public JournalEntery update(@PathVariable Long id , @RequestBody JournalEntery data){
        return entery.put(id , data);
    }

    //delete method
    @DeleteMapping("/id/{id}")
    public JournalEntery delete(@PathVariable Long id){
        return entery.remove(id);
    }
}
