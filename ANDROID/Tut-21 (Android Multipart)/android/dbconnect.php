<?php

		class DbConnect
		{
			private $con;
		 
			public function connect()
			{
				require_once dirname(__FILE__) . '/constant.php';
		 
				$this->con = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
		 
				if (mysqli_connect_errno()) {
					echo 'Failed to connect ' . mysqli_connect_error();
					return null;
				}
		 
				return $this->con;
			}
		}


?>