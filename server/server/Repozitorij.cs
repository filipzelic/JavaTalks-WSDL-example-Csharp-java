using Microsoft.ApplicationBlocks.Data;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Text;

namespace server
{
    public class Repozitorij
    {
        static string cs = ConfigurationManager.ConnectionStrings["cs"].ConnectionString;

        internal static List<Kolegij> listaSvihKolegija()
        {
            List<Kolegij> listaKolegija = new List<Kolegij>();

            DataSet ds = SqlHelper.ExecuteDataset(cs, "listaSvihKolegija");

            foreach (DataRow row in ds.Tables[0].Rows)
            {
                listaKolegija.Add(new Kolegij
                {
                    IDKolegij = (int)row["IDKolegij"],
                    Naziv = row["Naziv"].ToString(),
                    Nositelj = row["Nositelj"].ToString(),
                    ECTS = (int)row["ECTS"]
                });
            }

            return listaKolegija;
        }

        internal static List<Student> listaSvihStudenata()
        {
            List<Student> listaStudenata = new List<Student>();

            DataSet ds = SqlHelper.ExecuteDataset(cs, "listaSvihStudenata");

            foreach (DataRow row in ds.Tables[0].Rows)
            {
                listaStudenata.Add(new Student
                {
                    IDStudent = (int)row["IDStudent"],
                    Ime = row["Ime"].ToString(),
                    Prezime = row["Prezime"].ToString(),
                    JMBG = row["JMBAG"].ToString(),
                    godStudija = (int)row["godStudija"]
                });
            }

            return listaStudenata;
        }

        internal static List<Kolegij> ListaUpisanihKolegijaZaStudenta(int studentID)
        {
            List<Kolegij> listaKolegija = new List<Kolegij>();

            DataSet ds = SqlHelper.ExecuteDataset(cs, "ListaUpisanihKolegijaZaStudenta", studentID);

            foreach (DataRow row in ds.Tables[0].Rows)
            {
                listaKolegija.Add(new Kolegij
                {
                    Naziv = row["Naziv"].ToString(),
                    Nositelj = row["Nositelj"].ToString(),
                    ECTS = (int)row["ECTS"]
                });
            }

            return listaKolegija;
        }

        internal static List<Student> ListaUpisanihStudenataZaKolegij(int kolegijID)
        {
            List<Student> listaStudenata = new List<Student>();

            DataSet ds = SqlHelper.ExecuteDataset(cs, "ListaUpisanihStudenataZaKolegij", kolegijID);

            foreach (DataRow row in ds.Tables[0].Rows)
            {
                listaStudenata.Add(new Student
                {
                    Ime = row["Ime"].ToString(),
                    Prezime = row["Prezime"].ToString(),
                    JMBG = row["JMBAG"].ToString(),
                    godStudija = (int)row["godStudija"]
                });
            }

            return listaStudenata;
        }
    }
}