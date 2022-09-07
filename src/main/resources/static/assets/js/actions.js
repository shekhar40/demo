function btnPay() {
	//button.preventDefault();
	var btn = document.getElementById('payNow');
	var conf = confirm("Do you want to proceed!");
	//alert(conf);
	if(conf == true){
		btn.innerHTML = '<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Loading...';
		btn.disabled=true;
		return true;
	}
	return false;

}
function getChkBtn(){
	var btn = document.getElementById('chkbtn');
	var conf = confirm("Do you want to proceed!");
	//alert(conf);
	if(conf == true){
		btn.innerHTML = '<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Loading...';
		btn.disabled=true;
		return true;
	}
	return false;

}
function showReport(){
	var btn = document.getElementById('showRptBtn');
	var conf = confirm("Do you want to proceed!");
	//alert(conf);
	if(conf == true){
		btn.innerHTML = '<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Loading...';
		btn.disabled=true;
		return true;
	}
	return false;

}
function myFunction() {
  document.getElementById("payNow").innerHTML = "Hello World";
}
function ExportToExcel(type, fn, dl) {
	var elt = document.getElementById('tbl_exporttable_to_xls');
	var wb = XLSX.utils.table_to_book(elt, { sheet: "sheet1" });
	return dl ?
		XLSX.write(wb, { bookType: type, bookSST: true, type: 'base64' }) :
		XLSX.writeFile(wb, fn || ('MySheetName.' + (type || 'xlsx')));
}

 





