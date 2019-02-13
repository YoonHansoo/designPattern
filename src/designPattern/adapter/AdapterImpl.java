package designPattern.adapter;

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float num) {
		
		return (float) Math.doubled(num.doubleValue());
	}

	@Override
	public Float halfOf(Float num) {
		System.out.println("절반함수 호출");
		return (float)Math.half(num.doubleValue());
	}

}
