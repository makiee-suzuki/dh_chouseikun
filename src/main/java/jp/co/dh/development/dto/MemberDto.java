package jp.co.dh.development.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class MemberDto implements Serializable {
	private static final long serialVersionUID = 1L;
	public String nickName;
	public String mailAddress;

	public boolean isLogin(){
		if(nickName == null){
			return false;
		}
		return true;
	}
}
