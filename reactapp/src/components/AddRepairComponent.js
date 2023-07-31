import React, { useState, useEffect } from 'react';
import { Link, useParams, useNavigate } from 'react-router-dom';
import RepairService from '../services/RepairService';

const AddRepairComponent = () => {
  const [customer, setCustomer] = useState('');
  const [device, setDevice] = useState('');
  const [des, setDes] = useState('');
  const [status, setStatus] = useState('');

  const navigate = useNavigate();
  const { id } = useParams();

  const saveRepair = (e) => {
    e.preventDefault();
    const repair = { customer, device, des, status };
    if (id) {
      RepairService.updateRepair(id, repair)
        .then((response) => {
          navigate('/repairs');
        })
        .catch((error) => {
          console.log(error);
        });
    } else {
      RepairService.createRepair(repair)
        .then((response) => {
          console.log(response.data);
          navigate('/repairs');
        })
        .catch((error) => {
          console.log(error);
        });
    }
  };

  useEffect(() => {
    if (id) {
      RepairService.getRepairById(id)
        .then((response) => {
          setCustomer(response.data.customer);
          setDevice(response.data.device);
          setDes(response.data.des);
          setStatus(response.data.status);
        })
        .catch((error) => {
          console.log(error);
        });
    }
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  const title = id ? 'Update Repair' : 'Add Repair';

  return (
    <div>
      <br />
      <div className="container">
        <div className="row">
          <div className="card col-md-6 offset-md-3 offset-md-3">
            <h2 className="text-center">{title}</h2>
            <div className="card-body">
              <form>
                {/* <div className="form-group mb-2">
                  <label className="form-label">Repair Name:</label>
                  <input
                    type="text"
                    placeholder="Enter repair name"
                    name="repName"
                    className="form-control"
                    value={repName}
                    onChange={(e) => setRepName(e.target.value)}
                    required
                  />
                </div> */}
                <div className="form-group mb-2">
                  <label className="form-label">Customer</label>
                  <input
                    type="text"
                    placeholder="Enter customer "
                    name="customer"
                    className="form-control"
                    value={customer}
                    onChange={(e) => setCustomer(e.target.value)}
                    required
                  />
                </div>
                <div className="form-group mb-2">
                  <label className="form-label">Device:</label>
                  <input
                    type="text"
                    placeholder="Enter device"
                    name="device"
                    className="form-control"
                    value={device}
                    onChange={(e) => setDevice(e.target.value)}
                    required
                  />
                </div>
                <div className="form-group mb-2">
                  <label className="form-label">Description:</label>
                  <input
                    type="text"
                    placeholder="Enter description"
                    name="des"
                    className="form-control"
                    value={des}
                    onChange={(e) => setDes(e.target.value)}
                    required
                  />
                </div>
                <div className="form-group mb-2">
                  <label className="form-label">Status:</label>
                  <input
                    type="text"
                    placeholder="Enter status"
                    list="browsers" name="myStatus"
                    className="form-control"
                    value={status}
                    onChange={(e) => setStatus(e.target.value)}
                    required
                  />
                  <datalist id="browsers">
                  <option value="In Progress"/>
                  <option value="Completed"/>
                  <option value="Hold"/>
                  <option value="Cancelled"/>
                </datalist>
                </div>
                <button className="btn btn-success" onClick={saveRepair}>
                  Submit
                </button>
               
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AddRepairComponent;
