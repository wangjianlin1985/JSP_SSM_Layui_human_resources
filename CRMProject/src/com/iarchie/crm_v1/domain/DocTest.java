// 
// 
// 

package com.iarchie.crm_v1.domain;

public class DocTest
{
    private Long id;
    private String docname;
    private String docmsg;
    private String useraction;
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getDocname() {
        return this.docname;
    }
    
    public void setDocname(final String docname) {
        this.docname = ((docname == null) ? null : docname.trim());
    }
    
    public String getDocmsg() {
        return this.docmsg;
    }
    
    public void setDocmsg(final String docmsg) {
        this.docmsg = ((docmsg == null) ? null : docmsg.trim());
    }
    
    public String getUseraction() {
        return this.useraction;
    }
    
    public void setUseraction(final String useraction) {
        this.useraction = ((useraction == null) ? null : useraction.trim());
    }
}
