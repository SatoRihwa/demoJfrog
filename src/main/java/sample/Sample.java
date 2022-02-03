package sample;

import java.lang.invoke.MethodHandles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sample {
	
	/** �v�Z�l�ۑ��p */
	private int num = 0;
	
	public Sample(int i) {
		final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
		logger.debug("Log4j�g�p");
		setNum(i);
	}
	
	/**
	 * �e�X�g�p���\�b�h.
	 * @return �`�F�b�N����
	 */
	public String test() {
		return checkNum();
	}
	
	/**
	 * �`�F�b�N����
	 * @return �`�F�b�N����
	 */
	private String checkNum() {
		if(getNum() < 0) {
			return "�}�C�i�X";
		}else if(0 == getNum()){
			return "ゼロです";
		}else if(getNum() < 10) {
			return "�P��";
		}else {
			return "�Q���ȏ�";
		}
	}

	/**
	 * �l�擾
	 * @return num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * �l�ݒ�
	 * @param num �l
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	public void demo() {
		System.out.println("テスト!");
	}
}