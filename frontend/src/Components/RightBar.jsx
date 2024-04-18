import React from 'react';
import { useLocation } from 'react-router-dom';
import styles from '../style.module.css';
import PartDetails from './AllContainer/PartsAction/PartDetails';
import Contract from './Contract';
import OnBoard from './OnBoard';
import PartManagementPage from './Pages/PartManagementPage';
import SupplierPage from './Pages/SupplierPage';
import PartTable from './PartTable';

const RightBar = () => {
  let location = useLocation();
  let id = location.pathname.split('/').slice(-1)[0];
  console.log({ id });

  console.log(location.pathname);

  let componentToRender = <PartTable />;

  switch (location.pathname) {
    case '/part-table':
      componentToRender = <PartTable />;
      break;
    case '/onboard-status':
      componentToRender = <OnBoard />;
      break;
    case '/contract-details':
      componentToRender = <Contract />;
      break;
    case '/create-supplier':
      componentToRender = <SupplierPage />;
      break;
    case '/create-part':
      componentToRender = <PartManagementPage />;
      break;
    case `/part-details/${id}`:
      if (id) {
        componentToRender = <PartDetails id={id} />;
      }
      break;
  }

  return <div className={styles.rightbarConatiner}>{componentToRender}</div>;
};

export default RightBar;
