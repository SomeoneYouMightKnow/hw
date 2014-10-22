public class opponent{
    private String oname;
    private int ohealth = 100;
    private int omana = 0;
    private String o1name;
    private String o2name;
    private String o3name;
    private String o4name;
    public opponent(int x){
	if(x==1){
	    setOname("Ariel the Airbender");
	    setO1name("wind shot");
	    setO2name("air shield");
	    setO3name("meditate");
	    setO4name("tornado strike");
	}
	if(x==2){
	    setOname("Waverly the Waterbender");
	    setO1name("water blast");
	    setO2name("ice shield");
	    setO3name("water aura");
	    setO4name("tsunami");
	}
	if(x==3){
	    setOname("Rocky the Earthbender");
	    setO1name("boulder throw");
	    setO2name("rock block");
	    setO3name("solidify");
	    setO4name("earthquake");
	}
	if(x==4){
	    setOname("Flint the Firebender");
	    setO1name("fireball");
	    setO2name("flame block");
	    setO3name("fire focus");
	    setO4name("fire rain");
	}
    }
    public void setOname(String n){
	oname = n;
    }
    public void setO1name(String n){
	o1name = n;
    }
    public void setO2name(String n){
	o2name = n;
    }
    public void setO3name(String n){
	o3name = n;
    }
    public void setO4name(String n){
	o4name = n;
    }
    public String getOname(){
	return oname;
    }
    public int getOhealth(){
	return ohealth;
    }
    public int getOmana(){
	return omana;
    }
    public void setOhealth(int a){
	ohealth += a;
    }
    public void setOmana(int a){
	omana += a;
    }
    public String getOmove(int a){
	if(a==1) return o1name;
	if(a==2) return o2name;
	if(a==3) return o3name;
	if(a==4) return o4name;
	return "";
    }
    public int opick(int a, int b){
	if(b<0){
	    return 3;
	}
	if(a<2){
	    if(b<10){
		return 3;
	    }else{
		return 3+(int)(Math.random()*2);
	    }
	}
	if(b<2){
	    return 2+(int)(Math.random()*2);
	}
	if(a<5&&b<5){
	    if((int)(Math.random()*3)==1){
		return 1;
	    }else{
		return 2+(int)(Math.random()*2);
	    }
	}
	if(b<5){
	    int x = (int)(Math.random()*6);
	    if(x==0) return 1;
	    if(x==1) return 3;
	    return 2;
	}
	if(a<5){
	    return 3+(int)(Math.random()*2);
	}
	int x = (int)(Math.random()*3);
	if(x==0) return 2;
	return 4;
    }
}
