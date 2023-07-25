import React from 'react';
import { Link } from 'react-router-dom';
import Charts_render from './charts/Charts_render'


const AdminMainPage = () => {
  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'center' }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', width: '700px' }}>
          <button style={{width: '400px',height: '150px',backgroundColor: '#CEACE6',color: 'black',borderRadius: '5px',margin: '35px',fontWeight: 'bold'}}><Link to={`/customers`} >Customer Management</Link></button>
          <button style={{width: '400px',height: '150px',backgroundColor: '#CEACE6',color: 'black',borderRadius: '5px',margin: '35px',fontWeight: 'bold'}}><Link to={`/devices`} >Device Management</Link></button>
        </div>
      </div>
      <div style={{ display: 'flex', justifyContent: 'center' }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', width: '700px' }}>
          <button style={{width: '400px',height: '150px',backgroundColor: '#CEACE6',color: 'black',borderRadius: '5px',margin: '35px',fontWeight: 'bold'}}><Link to={`/employees`} >Employee Management</Link></button>
          <button style={{width: '400px',height: '150px',backgroundColor: '#CEACE6',color: 'black',borderRadius: '5px',margin: '35px',fontWeight: 'bold'}}><Link to={`/repairs`}>Repair Management</Link></button>
        </div>
      </div>
      <div style={{ display: 'flex', justifyContent: 'center' }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', width: '700px' }}>
          <button style={{width: '400px',height: '150px',backgroundColor: '#CEACE6',color: 'black',borderRadius: '5px',margin: '35px',fontWeight: 'bold'}}>Customer Booking Data</button>
          <button style={{width: '400px',height: '150px',backgroundColor: '#CEACE6',color: 'black',borderRadius: '5px',margin: '35px',fontWeight: 'bold'}}>Employee's Assigned</button>
        </div>
      </div>
      <Charts_render/>
    </div>
    
  );
};
