<?php
/*******************************************************************/
/* print_head(...) */
/*******************************************************************/
function print_head($pageTitle, $isGallery) { 
	if ($isGallery == FALSE) { ?>
		<head>
		    <title><?= $pageTitle ?></title>
			<meta charset="utf-8"/>
			<meta name="author" content="Ryan Protheroe"/>
			<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
			<link rel="stylesheet" href="/~17rcp/a5/css/icons.css"> 	
			<link rel="stylesheet" href="/~17rcp/a5/css/style.css"> 	
			<link rel="stylesheet" href="/~17rcp/a5/css/responsive.css">
			<script src="/~17rcp/a5/js/jquery-3.4.1.min.js"></script>
			<script src="/~17rcp/a5/js/header-slideshow.js"></script>
			<script src="/~17rcp/a5/js/emptySearch.js"></script>
		</head>
		<?php
	} else { ?>
		<head>
		    <title><?= $pageTitle ?></title>
		    <meta charset="utf-8"/>
		    <meta name="author" content="Ryan Protheroe"/>
		    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
		    <script src="/~17rcp/a5/js/jquery-3.4.1.min.js"></script>
		    <link rel="stylesheet" href="/~17rcp/a5/css/icons.css">  
		    <link rel="stylesheet" href="/~17rcp/a5/css/style.css">  
		    <link rel="stylesheet" href="/~17rcp/a5/css/responsive.css">
		    <link rel="stylesheet" href="/~17rcp/a5/css/magnific-popup.css">
		    <script src="/~17rcp/a5/js/jquery.magnific-popup.min.js"></script>
		    <script src="/~17rcp/a5/js/header-slideshow.js"></script>
		    <script src="/~17rcp/a5/js/emptySearch.js"></script>
		    <script src="/~17rcp/a5/js/thumbnail-gallery.js"></script>
		</head>
		<?php
	}
}
?>