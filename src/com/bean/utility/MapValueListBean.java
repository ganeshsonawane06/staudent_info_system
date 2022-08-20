
package com.bean.utility;

import java.util.ArrayList;


public class MapValueListBean {
    private long id;
    private ArrayList<String> mapValueList;

    public MapValueListBean() {
    }

    public MapValueListBean(ArrayList<String> mapValueList) {
        this.mapValueList = mapValueList;
    }

    public MapValueListBean(long id, ArrayList<String> mapValueList) {
        this.id = id;
        this.mapValueList = mapValueList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<String> getMapValueList() {
        return mapValueList;
    }

    public void setMapValueList(ArrayList<String> mapValueList) {
        this.mapValueList = mapValueList;
    }

    @Override
    public String toString() {
        return "MapValueList{" + "id=" + id + ", mapValueList=" + mapValueList + '}';
    }
    
}
