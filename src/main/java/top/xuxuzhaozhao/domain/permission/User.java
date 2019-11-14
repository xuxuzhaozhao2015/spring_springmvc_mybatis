package top.xuxuzhaozhao.domain.permission;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int id;
    private int roleid;
    private String username;
    private String password;
    private boolean isabled;
    private boolean isdelete;
    private Date lastlogintime;

    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsabled() {
        return isabled;
    }

    public void setIsabled(boolean isabled) {
        this.isabled = isabled;
    }

    public boolean isIsdelete() {
        return isdelete;
    }

    public void setIsdelete(boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"roleid\":")
                .append(roleid);
        sb.append(",\"username\":\"")
                .append(username).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"isabled\":")
                .append(isabled);
        sb.append(",\"isdelete\":")
                .append(isdelete);
        sb.append(",\"lastlogintime\":\"")
                .append(lastlogintime).append('\"');
        sb.append(",\"role\":")
                .append(role);
        sb.append('}');
        return sb.toString();
    }
}
