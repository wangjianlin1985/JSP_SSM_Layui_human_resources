// 
// 
// 

package com.iarchie.crm_v1.domain;

public class Position
{
    private Long id;
    private String positionname;
    private String positionmsg;
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getPositionname() {
        return this.positionname;
    }
    
    public void setPositionname(final String positionname) {
        this.positionname = ((positionname == null) ? null : positionname.trim());
    }
    
    public String getPositionmsg() {
        return this.positionmsg;
    }
    
    public void setPositionmsg(final String positionmsg) {
        this.positionmsg = ((positionmsg == null) ? null : positionmsg.trim());
    }
    
    @Override
    public String toString() {
        return "Position{id=" + this.id + ", positionname='" + this.positionname + '\'' + ", positionmsg='" + this.positionmsg + '\'' + '}';
    }
}
