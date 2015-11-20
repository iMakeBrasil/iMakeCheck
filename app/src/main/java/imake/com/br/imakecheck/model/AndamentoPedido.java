package imake.com.br.imakecheck.model;

import java.io.Serializable;

/**
 * Created by Tiago Ferezin on 20/11/2015.
 */
public class AndamentoPedido implements Serializable {

    private static Serializable SERIAL_ID = 1L;

    private Long idAtendimentoPedido;

    private String numeroPedido;
    private String dataAbertura;
    private String horaAtualizada;
    private String servicoEfetuado;
    private String descricao;

    public AndamentoPedido(){

    }

    public Long getIdAtendimentoPedido() {
        return idAtendimentoPedido;
    }

    public void setIdAtendimentoPedido(Long idAtendimentoPedido) {
        this.idAtendimentoPedido = idAtendimentoPedido;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getHoraAtualizada() {
        return horaAtualizada;
    }

    public void setHoraAtualizada(String horaAtualizada) {
        this.horaAtualizada = horaAtualizada;
    }

    public String getServicoEfetuado() {
        return servicoEfetuado;
    }

    public void setServicoEfetuado(String servicoEfetuado) {
        this.servicoEfetuado = servicoEfetuado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
