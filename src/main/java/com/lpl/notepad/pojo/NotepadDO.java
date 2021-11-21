package com.lpl.notepad.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * t_notepad
 * @author 
 */
@Data
@Accessors(chain = true)
@TableName("t_notepad")
public class NotepadDO implements Serializable {
    @TableField("id")
    private String id;
    @TableField("notepadContent")
    private String notepadContent;
    @TableField("notepadTime")
    private String notepadTime;

    private static final long serialVersionUID = 1L;
}