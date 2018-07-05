package spring.collectionAttribute;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DataTypeAll {

	private String[] arrayValue;
	private List listValue;
	private Set setValue;
	private Map mapValue;
	private Properties basicInfo;

	public List getListValue() {
		return listValue;
	}

	public void setListValue(List listValue) {
		this.listValue = listValue;
	}

	public Set getSetValue() {
		return setValue;
	}

	public void setSetValue(Set setValue) {
		this.setValue = setValue;
	}

	public Map getMapValue() {
		return mapValue;
	}

	public void setMapValue(Map mapValue) {
		this.mapValue = mapValue;
	}

	public Properties getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(Properties basicInfo) {
		this.basicInfo = basicInfo;
	}

	public String[] getArrayValue() {
		return arrayValue;
	}

	public void setArrayValue(String[] arrayValue) {
		this.arrayValue = arrayValue;
	}

}
