package com.project.ems.jobdetails.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidates")
public class CandidateDetailsDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cno;
	private String fname;
	private String lname;
	private String pno;
	private String alternatepno;
	private String email;
	private String techskills;
	private String otherskills;
	private String totalexp;
	private String prevorgs;
	private String summary;
	private String naukariid;
	private String linkedinid;
	private String source;
	private String createdon;
	private String createdby;
	private String updatedon;
	private String updatedby;
	private String lockedstatus;
	
	public CandidateDetailsDomain() {
		super();
		
	}

	public CandidateDetailsDomain(long cno, String fname, String lname, String pno, String alternatepno, String email,
			String techskills, String otherskills, String totalexp, String prevorgs, String summary, String naukariid,
			String linkedinid, String source, String createdon, String createdby, String updatedon, String updatedby,
			String lockedstatus) {
		super();
		this.cno = cno;
		this.fname = fname;
		this.lname = lname;
		this.pno = pno;
		this.alternatepno = alternatepno;
		this.email = email;
		this.techskills = techskills;
		this.otherskills = otherskills;
		this.totalexp = totalexp;
		this.prevorgs = prevorgs;
		this.summary = summary;
		this.naukariid = naukariid;
		this.linkedinid = linkedinid;
		this.source = source;
		this.createdon = createdon;
		this.createdby = createdby;
		this.updatedon = updatedon;
		this.updatedby = updatedby;
		this.lockedstatus = lockedstatus;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getAlternatepno() {
		return alternatepno;
	}

	public void setAlternatepno(String alternatepno) {
		this.alternatepno = alternatepno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTechskills() {
		return techskills;
	}

	public void setTechskills(String techskills) {
		this.techskills = techskills;
	}

	public String getOtherskills() {
		return otherskills;
	}

	public void setOtherskills(String otherskills) {
		this.otherskills = otherskills;
	}

	public String getTotalexp() {
		return totalexp;
	}

	public void setTotalexp(String totalexp) {
		this.totalexp = totalexp;
	}

	public String getPrevorgs() {
		return prevorgs;
	}

	public void setPrevorgs(String prevorgs) {
		this.prevorgs = prevorgs;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getNaukariid() {
		return naukariid;
	}

	public void setNaukariid(String naukariid) {
		this.naukariid = naukariid;
	}

	public String getLinkedinid() {
		return linkedinid;
	}

	public void setLinkedinid(String linkedinid) {
		this.linkedinid = linkedinid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCreatedon() {
		return createdon;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdatedon() {
		return updatedon;
	}

	public void setUpdatedon(String updatedon) {
		this.updatedon = updatedon;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public String getLockedstatus() {
		return lockedstatus;
	}

	public void setLockedstatus(String lockedstatus) {
		this.lockedstatus = lockedstatus;
	}

	@Override
	public String toString() {
		return "CandidateDetailsDomain [cno=" + cno + ", fname=" + fname + ", lname=" + lname + ", pno=" + pno
				+ ", alternatepno=" + alternatepno + ", email=" + email + ", techskills=" + techskills
				+ ", otherskills=" + otherskills + ", totalexp=" + totalexp + ", prevorgs=" + prevorgs + ", summary="
				+ summary + ", naukariid=" + naukariid + ", linkedinid=" + linkedinid + ", source=" + source
				+ ", createdon=" + createdon + ", createdby=" + createdby + ", updatedon=" + updatedon + ", updatedby="
				+ updatedby + ", lockedstatus=" + lockedstatus + "]";
	}
	
	
}
