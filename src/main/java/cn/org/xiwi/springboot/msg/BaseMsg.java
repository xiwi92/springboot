package cn.org.xiwi.springboot.msg;

public class BaseMsg<T> {
	protected int code;
	protected String msg;
	protected T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Msg [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
