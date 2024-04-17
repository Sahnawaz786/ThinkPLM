import React from 'react';
import { useLocation } from 'react-router-dom';
import styles from '../style.module.css';
import Contract from './Contract';
import Details from './Details';
import OnBoard from './OnBoard';
import SupplierPage from './Pages/SupplierPage';
import { Spinner } from 'react-bootstrap';

const RightBar = () => {
  let location = useLocation();

  console.log(location.pathname);

  let componentToRender = <Details/> ;

  switch (location.pathname) {
    case '/details':
      componentToRender = <Details />;
      break;
    case '/onboard-status':
      componentToRender = <OnBoard />;
      break;
    case '/contract-details':
      componentToRender = <Contract />;
      break;
      case '/create-supplier':
      componentToRender = <SupplierPage/>;
      break;
  }

  return (
    <div className={styles.rightbarConatiner}>
      {componentToRender}
    </div>
  );
};

export default RightBar;
