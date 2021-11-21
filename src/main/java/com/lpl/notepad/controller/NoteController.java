package com.lpl.notepad.controller;

import com.lpl.notepad.pojo.NotepadDO;
import com.lpl.notepad.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    @Autowired
    private NoteService noteService;

    //查全部
    @GetMapping("getAll")
    public List<NotepadDO> getAll(){
        List<NotepadDO> list = noteService.getAll();
        return list;
    }

    //删单个
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public Boolean deleteById(@RequestBody NotepadDO notepadDO){
        return noteService.deleteById(notepadDO.getId());
    }

    //更新单个
    @PostMapping("update")
    public Boolean update(@RequestBody NotepadDO notepadDO){
        return noteService.update(notepadDO);
    }

    //添加单个
    @PostMapping("add")
    public Boolean add(@RequestBody NotepadDO notepadDO){
        return noteService.addNew(notepadDO);
    }
}
