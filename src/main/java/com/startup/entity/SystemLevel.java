package com.startup.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CUST_SRV_PORT_TERM")
public class SystemLevel implements Serializable {

	/**
	 * ITPLVL
	 */
	private static final long serialVersionUID = 947322110016934343L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SRV_PORT_TERM_SEQ")
	@SequenceGenerator(name = "CUST_SRV_PORT_TERM_SEQ", sequenceName = "CUST_SRV_PORT_TERM_SEQ")
	@Column(name = "SEQNO", updatable = false, nullable = false)
	private Long SEQNO;

	@Column(name = "VSLINE")
	private String VSLINE;

	@Column(name = "VSTRAD")
	private String VSTRAD;

	@Column(name = "VSAGNT")
	private String VSAGNT;

	@Column(name = "VSPICODE")
	private String VSPICODE;

	@Column(name = "VSTQTERM")
	private String VSTQTERM;

	@Column(name = "CUSTOMER_CODE")
	private String CUSTOMER_CODE;

	@Column(name = "VSRCST")
	private String VSRCST;

	@Column(name = "VSAUSR")
	private String VSAUSR;

	public Long getSEQNO() {
		return SEQNO;
	}

	public void setSEQNO(Long sEQNO) {
		SEQNO = sEQNO;
	}

	public String getVSLINE() {
		return VSLINE;
	}

	public void setVSLINE(String vSLINE) {
		VSLINE = vSLINE;
	}

	public String getVSTRAD() {
		return VSTRAD;
	}

	public void setVSTRAD(String vSTRAD) {
		VSTRAD = vSTRAD;
	}

	public String getVSAGNT() {
		return VSAGNT;
	}

	public void setVSAGNT(String vSAGNT) {
		VSAGNT = vSAGNT;
	}

	public String getVSPICODE() {
		return VSPICODE;
	}

	public void setVSPICODE(String vSPICODE) {
		VSPICODE = vSPICODE;
	}

	public String getVSTQTERM() {
		return VSTQTERM;
	}

	public void setVSTQTERM(String vSTQTERM) {
		VSTQTERM = vSTQTERM;
	}

	public String getCUSTOMER_CODE() {
		return CUSTOMER_CODE;
	}

	public void setCUSTOMER_CODE(String cUSTOMER_CODE) {
		CUSTOMER_CODE = cUSTOMER_CODE;
	}

	public String getVSRCST() {
		return VSRCST;
	}

	public void setVSRCST(String vSRCST) {
		VSRCST = vSRCST;
	}

	public String getVSAUSR() {
		return VSAUSR;
	}

	public void setVSAUSR(String vSAUSR) {
		VSAUSR = vSAUSR;
	}
}
