package com.lpl.notepad.service;

import com.lpl.notepad.pojo.NotepadDO;

import java.util.List;

public interface NoteService {

    //查询全部
    List<NotepadDO> getAll();

    //删除单个
    Boolean deleteById(String id);

    //更改单个
    Boolean update(NotepadDO notepadDO);

    //增加
    Boolean addNew(NotepadDO notepadDO);

}
