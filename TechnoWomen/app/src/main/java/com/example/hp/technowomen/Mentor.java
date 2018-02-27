package com.example.hp.technowomen;

/**
 * Created by hp on 23-02-2018.
 */

class Mentor {
    private int id;
    private String name;
    private String field;
    private String district;

    public Mentor()
    {

    }
    public Mentor(int id1,String name1, String field1,String district1)
    {
        this.id=id1;
        this.name=name1;
        this.field=field1;
        this.district=district1;
    }
    public void setId(int id1)
    {
        this.id=id1;
    }
    public void setName(String name1)
    {
        this.name=name1;
    }
    public void setField(String field1)
    {
        this.field=field1;
    }
    public  void setDistrict(String district1)
    {
        this.district=district1;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getField() {
        return this.field;
    }

    public String getDistrict() {
        return this.district;
    }
}
