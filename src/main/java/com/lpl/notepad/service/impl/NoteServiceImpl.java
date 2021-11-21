package com.lpl.notepad.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lpl.notepad.mapper.NotepadMapper;
import com.lpl.notepad.pojo.NotepadDO;
import com.lpl.notepad.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NotepadMapper notepadMapper;


    @Override
    public List<NotepadDO> getAll() {
        //查所有
        List<NotepadDO> notepadDOS = notepadMapper.selectList(new LambdaQueryWrapper<>());
        return notepadDOS;
    }

    @Override
    public Boolean deleteById(String id) {
        //根据id查询并删除,返回影响行数
        int i = notepadMapper.deleteById(id);

        if(i!=0){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Boolean update(NotepadDO notepadDO) {

        //更新结果的影响行数
        int i = notepadMapper.updateById(notepadDO);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean addNew(NotepadDO notepadDO) {
        // 添加影响的行数
        int i = notepadMapper.insert(notepadDO);
        if(i!=0){
            return true;
        }else {
            return false;
        }
    }
}
