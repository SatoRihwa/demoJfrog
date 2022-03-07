package sample;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sample {
	
	/** チェック用変数 */
	private int num = 0;
	
	public Sample(int i) {
		final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
		logger.debug("Log4使用中");
		setNum(i);
	}
	
	/**
	 * 値テスト.
	 * @return チェック結果
	 */
	public String test() {
		return checkNum();
	}
	
	/**
	 * 値からチェック結果を文字列で返す.
	 * @return チェック結果文字列
	 */
	private String checkNum() {
		if(getNum() < 0) {
			return "マイナス";
		}else if(0 == getNum()){
			return "ゼロです";
		}else if(getNum() < 10) {
			return "10以下です";
		} else if(getNum() == 100) {
			return "100です";
		}else {
			return "10以上です";
		}
	}

	/**
	 * getter
	 * @return num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * setter
	 * @param num �l
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	public void demo() {
		System.out.println("テスト!");
	}
}