package com.github.hopedc.luzern.core.model;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * 针对@see标签指向的类具体信息
 *
 * @author hopedc
 * @date 2017-03-03 12:14
 */
@Data
public class ObjectInfo {

    /**
     * 返回的参数名称
     */
    private String name;

    /**
     * 源码在哪个类
     */
    private Class<?> type;

    /**
     * 上面的注释
     */
    private String comment;

    /**
     * 对象的属性
     */
    private List<FieldInfo> fieldInfos = new LinkedList<>();

}
