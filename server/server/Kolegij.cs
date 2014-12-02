using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace server
{
    public class Kolegij
    {
        public int IDKolegij { get; set; }
        public string Naziv { get; set; }
        public string Nositelj { get; set; }
        public int ECTS { get; set; }

        public Kolegij()
        {
            //do nothing
        }

        public Kolegij(string naziv, string nositelj, int ects)
        {
            this.Naziv = naziv;
            this.Nositelj = nositelj;
            this.ECTS = ects;
        }

        public override string ToString()
        {
            return Naziv + " " + Nositelj + " " + ECTS;
        }
    }
}