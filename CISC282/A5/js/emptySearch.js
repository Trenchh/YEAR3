function validateForm() {
  var x = jQuery.trim(document.forms["searchForm"]["searchQuery"].value);
  if (x == "") {
    alert("Empty field.");
    return false;
	}
}