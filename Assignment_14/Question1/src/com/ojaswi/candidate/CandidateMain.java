package com.ojaswi.candidate;

import java.util.List;
import java.util.Scanner;

public class CandidateMain {

	public static void main(String[] args) {
		int choice = 0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.ADD CANDIDATE");
			System.out.println("2.UPDATE CANDIDATE USING ID");
			System.out.println("3.SUM OF VOTE ON PARTYWISE");
			System.out.println("enter choice =");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				try (CandidateDAO cd = new CandidateDAO()) {
					System.out.println("ENETR NAME ");

					String name = sc.next();

					System.out.println("ENETR party ");
					String party = sc.next();

					System.out.println("ENETR votes ");
					int votes = sc.nextInt();

					Candidate c = new Candidate(0, name, party, votes);
					int cnt = cd.save(c);
					System.out.println("INSERTED ROW = " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try (CandidateDAO cd = new CandidateDAO()) {
					System.out.println("ENTER candidate ID TO update ");
					int id = sc.nextInt();

					System.out.println("ENTER candidate new name ");
					String name = sc.next();
					System.out.println("ENTER candidate new party  ");
					String party = sc.next();
					Candidate c = new Candidate(id, name, party, 0);
					int cnt = cd.update(c);
					System.out.println("UPDATED ROW = " + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try (CandidateDAO dao = new CandidateDAO()) {

					List<PartyVotes> list = dao.getPartyWiseVotes();
					list.forEach(x -> System.out.println(x));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			}
		} while (choice != 0);
//		try (CandidateDAO cd = new CandidateDAO()) {
//			System.out.println("ENETR NAME ");
//
//			String name = sc.next();
//
//			System.out.println("ENETR party ");
//			String party = sc.next();
//
//			System.out.println("ENETR votes ");
//			int votes = sc.nextInt();
//
//			Candidate c = new Candidate(0, name, party, votes);
//			int cnt = cd.save(c);
//			System.out.println("INSERTED ROW = " + cnt);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try (CandidateDAO cd = new CandidateDAO()) {
//			System.out.println("ENTER candidate ID TO update ");
//			int id = sc.nextInt();
//
//			System.out.println("ENTER candidate new name ");
//			String name = sc.next();
//			System.out.println("ENTER candidate new party  ");
//			String party = sc.next();
//			Candidate c = new Candidate(id, name, party, 0);
//			int cnt = cd.update(c);
//			System.out.println("UPDATED ROW = " + cnt);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try (CandidateDAO dao = new CandidateDAO()) {
//
//			List<PartyVotes> list = dao.getPartyWiseVotes();
//			list.forEach(x -> System.out.println(x));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
