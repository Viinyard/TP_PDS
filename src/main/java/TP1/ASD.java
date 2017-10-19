package TP1;

import java.util.Iterator;

public class ASD {
	static public class Document {
		private Fichier s;

		public Document(Fichier s) {
			this.s = s;
		}

		public String toNtriples() {
			String ret = "";
			Iterator<Sujet> its = this.s.getIterator();
			
			while(its.hasNext()) {
				Sujet s = its.next();
				Iterator<Verbe> itv = s.getIterator();
				while(itv.hasNext()) {
					Verbe v = itv.next();
					Iterator<Complement> itc = v.getIterator();
					while(itc.hasNext()) {
						Complement c = itc.next();
						ret += "<"+s.getId().getName()+"> <"+v.getId().getName()+"> <"+c.getText()+">\n";
					}
				}
			}
			
			return ret;
		}
	}
}
