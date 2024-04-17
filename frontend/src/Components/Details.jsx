import React, { useContext, useEffect, useState } from 'react';
import { FaSearch } from 'react-icons/fa';
import { useNavigate } from 'react-router-dom';
import { UserContext } from '../store/UserProvider';
import styles from '../style.module.css';
import DisplayAlert from '../utils/DisplayAlert';

const Details = () => {
  const { datas, setDeleteUser,setChoice, deleteuser, setDatas,choice,showAlert,setShowAlert } = useContext(UserContext);

  const [data, setData] = useState(datas);

  const [users, setUser] = useState([]);

  const navigate=useNavigate();

  const deleteUser = (user) => {
    if (!users.includes(user)) {
      setUser([...users, user]);
    } else {
      const data = users.filter((elem) => elem !== user);
      setUser(data);
    }
  };

  const handleDeleteBtn = () => {
    setShowAlert(true);
    console.log('The value of alert is ', showAlert);
  };

  useEffect(() => {
    setDeleteUser(users);
  }, [users]);

  useEffect(()=>{
    if (choice) {
      const newData = datas.filter((elem) => !deleteuser.includes(elem));
      setDatas(newData);
      setData(newData);
    }
  },[choice])

  const handlePartClick=()=>{
    navigate('/create-part')
  }

  return (
    <div>
      <div className={styles.rightBar}>
        <div className={styles.rightBarLogo}>
          <img
            src='https://cdn-icons-png.freepik.com/512/10703/10703269.png'
            width={30}
            height={30}
            alt='part'
            onClick={()=>{handlePartClick()}}
          />
          <img
            src='https://cdn-icons-png.freepik.com/512/7959/7959420.png'
            width={30}
            height={30}
            alt=''
            
          />
          <img
            src='https://cdn-icons-png.freepik.com/512/5994/5994710.png'
            width={30}
            height={30}
            alt=''
          />
          <img
            src='https://cdn-icons-png.freepik.com/512/9740/9740598.png'
            width={30}
            height={30}
            alt=''
            className={styles.deleteIcon}
            onClick={() => {handleDeleteBtn()}}
          />
          <img
            src='https://cdn-icons-png.freepik.com/512/3425/3425921.png'
            width={30}
            height={30}
            alt=''
          />
        </div>
        <div className={styles.searchSection}>
          <FaSearch />
          <input type='text' name='' width={300} height={300} id='' />
        </div>
      </div>
      <table>
        <thead>
          <tr>
            <th>Supplier Name</th>
            <th>Supplier Type</th>
            <th>Number</th>
            <th>Name</th>
            <th>Version</th>
            <th>Iteration</th>
            <th>Created By</th>
            <th>Created Date</th>
            <th>state</th>
          </tr>
        </thead>
        <tbody>
          {data.map((elem) => (
            <tr key={elem.id}>
              <td className={styles.checkboxStyle}>
                <input onClick={() => deleteUser(elem)} type='checkbox' />
                {elem.SupplierName}
              </td>
              <td>{elem.SupplierType}</td>
              <td>{elem.Number}</td>
              <td>{elem.Name}</td>
              <td>{elem.Version}</td>
              <td>{elem.Iteration}</td>
              <td>{elem.CreatedBy}</td>
              <td>{elem.CreatedDate}</td>
              <td>{elem.State}</td>
            </tr>
          ))}
        </tbody>
      </table>
      {showAlert && <DisplayAlert/>}
    </div>
  );
};

export default Details;
