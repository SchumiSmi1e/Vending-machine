package my;

public class Machine
{
	public int money;
	
	public void insert(int cash)
	{
		if(cash !=5 && cash != 10)
		{
			System.out.println("仅支持5元、10元面额纸币");
			return;
		}
		else
		{
			System.out.println("欢迎使用");
		}
		this.money += cash;
		System.out.println("当前余额:" + this.money + "元");
	}
	
	public void buy(int n)
	{
		int cost = n*3;
		if(cost>this.money)
		{
			System.out.println("余额不足");
			return;
		}
		System.out.println("购买了" + n + "瓶");
		
		this.money -= cost;
		System.out.println("当前余额:" + this.money + "元");
	}
	
	public void retrieve(int status)
	{
		if(status == 0)
		{
			System.out.println("结束购买，找零：" + this.money + "元");
			return;
		}
		else if (status == 1)
		{
			System.out.println("继续购买");
			status = 0;
		}
	}
	
}
