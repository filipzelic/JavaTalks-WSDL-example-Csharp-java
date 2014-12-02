using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace server
{
    public class Student
    {
        public int IDStudent { get; set; }
        public string Ime { get; set; }
        public string Prezime { get; set; }
        public string JMBG { get; set; }
        public int godStudija { get; set; }

        public Student()
        {
            //do nothing
        }

        public Student(string ime, string prezime, string jmbg, int godStudija)
        {
            this.Ime = ime;
            this.Prezime = prezime;
            this.JMBG = jmbg;
            this.godStudija = godStudija;
        }
    }
}