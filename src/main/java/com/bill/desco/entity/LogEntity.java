package com.bill.desco.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Entity
@Table(name="tbl_log")
public class LogEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
		private String billNo;
		private String url;
		@Lob
		private String send_msg;
		@Lob
		private String resp_msg;
		private String status;
		//@DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss a")
		//@Temporal(TemporalType.TIMESTAMP)
		//@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
		@CreationTimestamp
		private LocalDateTime entry_date= LocalDateTime.now(ZoneId.of("Asia/Dhaka"));
		private String user_id;
		private String branch_code;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getBillNo() {
			return billNo;
		}
		public void setBillNo(String billNo) {
			this.billNo = billNo;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getSend_msg() {
			return send_msg;
		}
		public void setSend_msg(String send_msg) {
			this.send_msg = send_msg;
		}
		public String getResp_msg() {
			return resp_msg;
		}
		public void setResp_msg(String resp_msg) {
			this.resp_msg = resp_msg;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public LocalDateTime getEntry_date() {
			return entry_date;
		}
		public void setEntry_date(LocalDateTime entry_date) {
			this.entry_date = entry_date;
		}
		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public String getBranch_code() {
			return branch_code;
		}
		public void setBranch_code(String branch_code) {
			this.branch_code = branch_code;
		}
		public LogEntity(String billNo, String url, String send_msg, String resp_msg, String status,
                         String user_id, String branch_code) {

			this.billNo = billNo;
			this.url = url;
			this.send_msg = send_msg;
			this.resp_msg = resp_msg;
			this.status = status;
			//this.entry_date = entry_date;
			this.user_id = user_id;
			this.branch_code = branch_code;
		}
		public LogEntity() {
			
		}

	@Override
	public String toString() {
		return "LogEntity{" +
				"id=" + id +
				", billNo='" + billNo + '\'' +
				", url='" + url + '\'' +
				", send_msg='" + send_msg + '\'' +
				", resp_msg='" + resp_msg + '\'' +
				", status='" + status + '\'' +
				", entry_date=" + entry_date +
				", user_id='" + user_id + '\'' +
				", branch_code='" + branch_code + '\'' +
				'}';
	}
}
