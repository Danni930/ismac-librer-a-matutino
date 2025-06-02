import org.junit.jupiter.api.Test;

import java.util.Date;

public class FacturaTest {

    private Factura factura;
    private Cliente cliente;

    @BeforeEach
    public void setUp() {

        factura = new Factura();

        cliente = new Cliente(1, "1701234567", "Juan", "Tipán", "Av. por ahí.", "0987543211", "jt@elpcorreo.com");

        factura.setIdFactura(1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        factura.setTotalNeto(100.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);
        //inyeccion de dependencias
        factura.setCliente(cliente);
    }

    // algo
    @Test
    public void testFacturaConstructorAndGetters() {

        assertAll("Validar datos factura",
                () -> assertEquals(1, factura.getIdFactura()),
                () -> assertEquals("FAC-0001", factura.getNumFactura()),
                () -> assertEquals(new Date(), factura.getFecha()),
                () -> assertEquals(100.00, factura.getTotalNeto()),
                () -> assertEquals(15.00, factura.getIva()),
                () -> assertEquals(115.00, factura.getTotal())
                () -> assertEquals("Juan", factura.getCliente().getNombre())
        );
    }




}
