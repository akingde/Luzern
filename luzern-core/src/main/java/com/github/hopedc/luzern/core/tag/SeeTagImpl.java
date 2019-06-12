package com.github.hopedc.luzern.core.tag;

import com.github.hopedc.luzern.core.model.ObjectInfo;

/**
 * 针对@see注释标签进行封装,返回@see上注释的类信息
 * <p>
 * Created by hopedc on 2017/3/4.
 */
public class SeeTagImpl extends DocTag<ObjectInfo> {

    private ObjectInfo objectInfo;

    public SeeTagImpl(String tagName, ObjectInfo objectInfo) {
        super(tagName);
        this.objectInfo = objectInfo;
    }

    @Override
    public ObjectInfo getValues() {
        return objectInfo;
    }
}
