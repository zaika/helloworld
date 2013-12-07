package am.zara.shop.bean;


import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userDate", eager = true)
@SessionScoped
public class UserDate implements Serializable {
   private Date date;

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }
}