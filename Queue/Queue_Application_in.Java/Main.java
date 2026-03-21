package FIFO_and_Priorty_Queue;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public Node start,q;
	public Node startCopy,qCopy;
	public Node startPriorty,qPriorty;
	
	public Node beforeTemp,temp;
	
	
	int stop=0;
	int sum;
	int i;
	
	
	public void normalQueue(int personNumber,Random rand) {
		sum=0;
		i=1;
		
		while(i<=personNumber) {
			Node node=new Node();
			
			node.personSequence=i;
			node.randNumber=rand.nextInt(271)+30;
			
			sum+=node.randNumber;
			
			node.waitTime=sum;
			node.next=null;
			
			if(i==1) {
				start=node;
				q=start;
			}else {
				q.next=node;
				q=q.next;
			}
			
			i++;
		}
		
		q=start;
		
		
		displayNormalQueue(personNumber);;
	}
	public void displayNormalQueue(int personNumber) {
		while(q!=null) {				
			System.out.println("person"+q.personSequence+"-"+q.waitTime+"sn");
			q=q.next;
		}
		
		System.out.println("\nortalama bitirme süresi:"+sum/personNumber+"sn");
		q=start;
	}
	

//burası diğer queue için
	public void copy() {
		sum=0;
		
		while(q!=null) {
			Node nodeCopy=new Node();

			nodeCopy.personSequence=q.personSequence;
			nodeCopy.randNumber=q.randNumber;
			nodeCopy.next=null;
			
			if(startCopy==null) {
				startCopy=nodeCopy;
				qCopy=startCopy;
			}else {
				qCopy.next=nodeCopy;
				qCopy=qCopy.next;
			}
			
			
			q=q.next;
		}
		

		q=start;
	}
	public void findTheSmallestNumber() {
		temp=startCopy;
		beforeTemp=startCopy;
		qCopy=startCopy;
		
		while(qCopy.next!=null) {
			if(temp.randNumber>qCopy.next.randNumber) {
				temp=qCopy.next;
				beforeTemp=qCopy;
			}
			
			qCopy=qCopy.next;
		}

		
		sum+=temp.randNumber;
		temp.waitTime=sum;
				
		if(temp==startCopy) {
			if(startCopy.next!=null) {
				startCopy=startCopy.next;
			} else {   // stop sayacını çalıştırdım.
				stop=1;
			}
		} else {
			beforeTemp.next=temp.next;
		}
		
		temp.next=null;
		
		
		priortyQueue(temp,stop);
	}
	public void priortyQueue(Node temp,int sonElemanMı) {
		if(startPriorty==null) {
			startPriorty=temp;
			qPriorty=startPriorty;
		}else {
			qPriorty.next=temp;
			qPriorty=qPriorty.next;
		}
		
		if(stop==1) {
			return;
		}
		
		findTheSmallestNumber();
	}
	public void displayPriortyQueue(int personNumber) {
		i=1;
		
		qPriorty=startPriorty;
		
		System.out.println("*******");
		while(qPriorty!=null) {
			if(qPriorty.personSequence==i) {
				System.out.println(qPriorty.personSequence+"-"+qPriorty.waitTime+"sn"+"-- Bekleme Süresi farkı: "+(qPriorty.waitTime-q.waitTime)+"sn");
				
				
				q=q.next;
				qPriorty=startPriorty;
				
				i++;
			}else {
				qPriorty=qPriorty.next;
			}
		}
		System.out.println("\nortalama bitirme süresi:"+sum/personNumber+"sn");
		
		qPriorty=startPriorty;
		q=start;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand=new Random();
		
		Main main=new Main();
		
		System.out.print("kaç kişi geldi:");
		int personNumber=scan.nextInt();
		
		main.normalQueue(personNumber,rand);
		
		
		main.copy();
		main.findTheSmallestNumber();
		main.displayPriortyQueue(personNumber);
	}
}





class Node{
	int personSequence;
	int randNumber;
	int waitTime;
	Node next;
}


