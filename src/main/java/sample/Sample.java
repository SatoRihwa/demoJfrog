package sample;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sample {
	
	/** 計算値保存用 */
	private int num = 0;
	
	public Sample(int i) {
		final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
		logger.debug("Log4j使用");
		setNum(i);
	}
	
	/**
	 * テスト用メソッド.
	 * @return チェック結果
	 */
	public String test() {
		return checkNum();
	}
	
	/**
	 * チェック処理
	 * @return チェック結果
	 */
	private String checkNum() {
		if(getNum() < 0) {
			return "マイナス";
		}else if(0 == getNum()){
			return "ゼロ";
		}else if(getNum() < 10) {
			return "１桁";
		}else {
			return "２桁以上";
		}
	}

	/**
	 * 値取得
	 * @return num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * 値設定
	 * @param num 値
	 */
	public void setNum(int num) {
		this.num = num;
	}
}