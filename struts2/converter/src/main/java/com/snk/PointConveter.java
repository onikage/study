package com.snk;

import java.util.Map;

import ognl.DefaultTypeConverter;

public class PointConveter extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map context, Object value, Class toType){
		if(Point.class.equals(toType)){
			Point p = new Point();
			String x = ((String[])value)[0].split(",")[0];
			String y = ((String[])value)[0].split(",")[1];
			p.setX(Integer.valueOf(x));
			p.setY(Integer.valueOf(y));
			return p;
		}
		if(String.class.equals(toType)){
			Point p = (Point)value;
			return "x="+p.getX()+"y="+p.getY();
		}
		return null;
	}
}
