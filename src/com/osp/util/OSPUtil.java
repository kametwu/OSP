package com.osp.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.osp.annotation.FieldMeta;

public class OSPUtil {
	
	/**
	 * QuoteFieldNames———-输出key时是否使用双引号,默认为true 
	 * WriteMapNullValue——–是否输出值为null的字段,默认为false 
	 * WriteNullNumberAsZero—-数值字段如果为null,输出为0,而非null 
	 * WriteNullListAsEmpty—–List字段如果为null,输出为[],而非null 
	 * WriteNullStringAsEmpty—字符类型字段如果为null,输出为"",而非null 
	 * WriteNullBooleanAsFalse–Boolean字段如果为null,输出为false,而非null
	 * 示例：SerializerFeature.WriteMapNullValue
	 * @param obj
	 * @return JSON String
	 */
	public static String toJSONString(Object obj) {
		return JSONArray.toJSONString(obj, SerializerFeature.WriteMapNullValue);
	}
	
	public static Object getAnnoValue(Class<?> clazz, String fieldName, String annoAttr) {
		Object annoValue = null;
		try {
			Field field = clazz.getDeclaredField(fieldName);
			FieldMeta fm = field.getDeclaredAnnotation(FieldMeta.class);
			Method method = fm.annotationType().getDeclaredMethod(annoAttr);
			annoValue = method.invoke(fm);
		} catch (Exception e) {
			annoValue = null;
		}
		return annoValue;
	}
	
	public static Object getAnnoValue(Class<?> clazz, String fieldName, Class<?> annoClazz, String annoAttr) {
		Object annoValue = null;
		try {
			Field field = clazz.getDeclaredField(fieldName);
			Annotation[] annos = field.getDeclaredAnnotations();
			for (Annotation anno : annos) {
				if(annoClazz == anno.annotationType()) {
					Method method = anno.annotationType().getDeclaredMethod(annoAttr);
					annoValue = method.invoke(anno);
					break;
				}
			}
		} catch (Exception e) {
			annoValue = null;
		}
		return annoValue;
	}

}
