package inheritance;

publi c class Multi_whatsapp3 extends Multi_whatsapp2
{
	public void vediocall()
	{
		System.out.println("3rd version have vedio call");
	}

	public static void main(String[] args) 
	{
		Multi_whatsapp3 m1=new Multi_whatsapp3();
		m1.text();
		m1.audiocall();
		m1.vediocall();
	}
}
