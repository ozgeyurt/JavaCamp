package eTrade.business.concretes;

import eTrade.business.abstracts.SendMessage;

public class SendMessageManager implements SendMessage{

	@Override
	public void sendMail() {
		System.out.println("eMail: aktivasyon kodu için tıklayınız");
		
	}

}
