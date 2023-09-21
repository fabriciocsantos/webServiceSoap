/**
 * 
 */
/**
 * @author Fabrício
 *
 */
module webServiceSoap {
    requires org.apache.cxf.frontend.jaxws;
    requires jakarta.jws;
    requires jakarta.xml.bind;
    opens br.com.fiap.entity;
    exports br.com.fiap.ws.service;
}
