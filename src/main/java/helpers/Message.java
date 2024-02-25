package helpers;

public class Message {
	private String msgContent;
	private String msgType;
	private String msgCss;
	
	public Message(String msgContent, String msgType, String msgCss) {
		this.msgContent = msgContent;
		this.msgType = msgType;
		this.msgCss = msgCss;
	}
	
	
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgCss() {
		return msgCss;
	}
	public void setMsgCss(String msgCss) {
		this.msgCss = msgCss;
	}
	
}
