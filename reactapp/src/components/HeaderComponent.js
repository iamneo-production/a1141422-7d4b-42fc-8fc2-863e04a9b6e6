import React from 'react'
import '../css/topheader.css';
import Sidebar from './Sidebar';
import { Link } from 'react-router-dom';
const HeaderComponent = () => {
  return (
    <div className='row top_header' >
      <header>
        <div className='navbar navbar-expand-md'>
            <div style={{textAlign : 'center', height : '50px', width : '100vw', display:'flex'}}>
            <h1> AC REPAIR PORTAL</h1>
            
            <div className='col-1 col-md-1 col-xl-1 col-lg-1' style={{margin:'40px', marginLeft:"600px"}}>
        <div className="container-Project-item" >
        <Link className="menu-item" to={`/AboutUs`}>
        <buton type="button" className="btn btn-primary">About Us</buton>
      </Link> 
      <Link className="menu-item" to="/AboutUs#contact"> 
        <button  type="button" className="btn btn-primary">Contact Us</button>
           </Link>
        </div>
      </div>
      <div className='col-1 col-md-1 col-xl-1 col-lg-1' style={{margin:'40px', marginLeft:"50px"}}>
        <div className="container-Project-item" >
       
        </div>
      </div>
      </div>
        </div>
      </header>
    </div>
  )
}

export default HeaderComponent