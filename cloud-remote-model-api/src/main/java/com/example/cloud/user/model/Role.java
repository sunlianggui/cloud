package com.example.cloud.user.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2019/5/6.
 */
public class Role {

    private Integer rid;

    private String rname;

    private Set<Module> modules = new HashSet<>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }
}
