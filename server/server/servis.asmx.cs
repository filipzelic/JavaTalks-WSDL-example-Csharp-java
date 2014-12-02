using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace server
{
    /// <summary>
    /// Summary description for servis
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class servis : System.Web.Services.WebService
    {
        [WebMethod]
        public List<Kolegij> ListaSvihKolegija()
        {
            List<Kolegij> listaKolegija = Repozitorij.listaSvihKolegija();

            return listaKolegija;
        }

        [WebMethod]
        public List<Student> ListaSvihStudenata()
        {
            List<Student> listaStudenata = Repozitorij.listaSvihStudenata();

            return listaStudenata;
        }

        [WebMethod]
        public List<Kolegij> ListaUpisanihKolegijaZaStudenta(int studentID)
        {
            List<Kolegij> listaKolegija = Repozitorij.ListaUpisanihKolegijaZaStudenta(studentID);

            return listaKolegija;
        }

        [WebMethod]
        public List<Student> ListaUpisanihStudenataZaKolegij(int kolegijID)
        {
            List<Student> listaStudenata = Repozitorij.ListaUpisanihStudenataZaKolegij(kolegijID);

            return listaStudenata;
        }
    }
}
